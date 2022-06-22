package com.bobo.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bobo.reggie.common.R;
import com.bobo.reggie.entity.Employee;
import com.bobo.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 员工登录
     * @param request
     * @param employee
     * @return
     */
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){
        // 1. 将页面提交的代码进行 md5 加密处理
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        // 2. 根据页面提交的用户名 username 查询数据库
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee employeeServiceOne = employeeService.getOne(queryWrapper);

        // 3. 如果没有查询到则返回登录失败
        if (employeeServiceOne == null) {
            return R.error("登录失败");
        }

        // 4. 密码比对
        if (!employeeServiceOne.getPassword().equals(password)) {
            return R.error("登录失败");
        }

        // 5. 查看员工状态，如已被禁用，则返回已被禁用结果
        if (employeeServiceOne.getStatus() == 0) {
            return R.error("账号已被禁用");
        }

        // 6. 登录成功，将员工 id 存入 session 并返回登录成功结果
        request.getSession().setAttribute("employee", employeeServiceOne.getId());
        return R.success(employeeServiceOne);
    }

}
