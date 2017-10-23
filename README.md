## 路由

```
    Android平台中对页面、服务提供路由功能的中间件，我的目标是 —— 简单且够用。
```

#####  [![Hex.pm](https://img.shields.io/hexpm/l/plug.svg)](https://www.apache.org/licenses/LICENSE-2.0)

---

#### 最新版本

模块|router|compiler|annotation
---|---|---|---


#### 一、功能介绍
1. **支持直接解析标准URL进行跳转，并自动注入参数到目标页面中,目前版本只支持activity**
2. **支持多模块工程使用**
3. **支持依赖注入**


#### 二、典型应用
1. 跨模块页面跳转，模块间解耦
2. 跨模块API调用，通过控制反转来做组件解耦


#### 三、基础功能
1. 添加依赖和配置
``` gradle
project build.gradle
buildscript {
    repositories {

        maven{ url 'https://dl.bintray.com/xeon-co/maven'}
        jcenter()
        mavenCentral()
    }
    
    .......
}

module build.gradle
compile 'cn.xeon:router:0.2@aar'
```

2. 添加注解
``` java

eg.
public class ModuleBRouterCable extends RouterCable {

	@Route(path = "cn.xeon.router.modulea.RouterAActivity")
	public static final String ROUTER_MODULEA_ACTIVITY = "moduleb";
}


```

3. 初始化SDK
``` java
MainRouterHub.getInstance().addCable(new ModuleBRouterCable());
```

4. 发起路由操作
``` java

MainRouterHub.getInstance().plug(ModuleBRouterCable.ROUTER_MODULEA_ACTIVITY).navi(ModuleBActivity.this);

```

5. 添加混淆规则(如果使用了Proguard)
``` 
-keep class **$$viewInject** { *; }
-keep class cn.xeon.annotation.** { *; }

```



#### 四、Q&A


#### 五、其他

1. 沟通和交流

