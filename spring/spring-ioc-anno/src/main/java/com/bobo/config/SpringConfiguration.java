package com.bobo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

// sign this class this core config class of spring
@Configuration
// <context:component-scan base-package="com.bobo"/>
@ComponentScan("com.bobo")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
