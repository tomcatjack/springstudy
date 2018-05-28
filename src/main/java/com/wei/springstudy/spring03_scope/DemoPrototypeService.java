package com.wei.springstudy.spring03_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * prototype 每次调用都会新建一个bean
 *
 * * 有状态会话bean   ：每个用户有自己特有的一个实例，在用户的生存期内，bean保持了用户的信息，即“有状态”
 * ；一旦用户灭亡（调用结束或实例结束），bean的生命期也告结束。即每个用户最初都会得到一个初始的bean。
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
