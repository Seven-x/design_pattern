### 责任链模式 ： Chain of Responsibility Pattern
-
行为型模式
-
概念：
使多个对象都有机会处理请求，
从而避免请求的发送者和接受者之间的耦合关系。
将对象连成一条链，并沿着这条链传递该请求，
直到有一个对象处理他为止。

- 意图：避免请求发送者和接收者耦合在一起，让多个对象都可能接收请求。

- 解决：责任链上的处理者负责处理请求，客户只需要将请求发送到责任链即可，
无需关心处理请求的细节和请求的传递，所以责任链将发送者和接收者解耦了。

- 应用：
    + 红楼梦中的"击鼓传花"
    + JS中的事件冒泡
    + tomcat对Encoding的处理
    + Struts2的拦截器
    + Servlet的Filter

- 优点：
    + 降低耦合度，将请求发送者和接收者解耦。
    + 简化对象，对象不需要知道链的结构。
    + 增强对象指派职责的灵活性，通过改变链内的成员或调动他们的次序，允许动态的新增或删除责任。
    + 增加新的请求处理类很方便。
    
- 缺点：
    + 不能确保请求一定被接收。
    + 系统性能将受到一定的影响，可能造成循环调用。
    + 不容易观察运行的特征，有碍于除错。

- 场景：
    + 有多个对象可以处理同一个请求，具体哪个对象处理由运行时刻自动确定。
    + 在不明确接收者的情况下，向多个对象中的一个提交请求。
    + 可动态指定一组对象处理请求
    + 审批
    
- 实现： demo_b

