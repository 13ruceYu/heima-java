package com.bobo.web;

import com.bobo.pojo.Brand;
import com.bobo.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    // 1. call BrandService
    private final BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Brand> brandList = brandService.selectAll();

        // 2. save to request region
        request.setAttribute("brands", brandList);

        // 3. dispatch to brand.jsp
        request.getRequestDispatcher("brand.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
