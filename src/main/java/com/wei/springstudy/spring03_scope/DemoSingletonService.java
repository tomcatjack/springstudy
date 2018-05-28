package com.wei.springstudy.spring03_scope;

import org.springframework.stereotype.Service;

/**
 * 一个spring容器只会有一个bean的实例   线程不安全
 *
 * 默认时Singleton 相当于 @Scope("singleton")
 *
 * 无状态会话bean ：bean一旦实例化就被加进会话池中，各个用户都可以共用。即使用户已经消亡，bean   的生命期也不一定结束，
 * 它可能依然存在于会话池中，供其他用户调用。由于没有特定的用户，那么也就不能保持某一用户的状态，所以叫无状态bean。
 * 但无状态会话bean   并非没有状态，如果它有自己的属性（变量），那么这些变量就会受到所有调用它的用户的影响，这是在实际应用中必须注意的
 */
@Service
public class DemoSingletonService {

}
