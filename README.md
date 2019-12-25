# String Cloud Alibaba

## 为什么微服务这么火？


害我们好奇怪的人们都想去接触并解了。
至少在我们这种三四线城市没有任何作用。
跟本就没有公司会采用。
面试的时候，到会拿出来说。
无聊。

## 关于微服务

感觉没什么准则，
不就是多个应用之间通过 HTTP 请求，互相通信而且么。
对于服务的划分更是。让人弄不懂。

数据库问题。

模型的问题。

## 关于本项目

纯粹练习，使用 Alibaba 的组件


### 为什么现在的MAVEN 项目总是有个父 POM 统一管这依赖

总之都是跟风而已。

所有子项目都继承

实际使用每次版本更新的不就会变得相当麻烦么。依赖管理方面。

每次在父 POM 中增加依赖都需要慎重的考虑

### 服务注册中心

由于个人开发，每次都要使用nacos 所以直接使用官网上的nacos 学习使用

http://console.nacos.io/nacos

username/password: nacos


### 消费提供者

mvc 中的 service

nacos-provider-server


### 服务消费者

mvc 中的 service

nacos-consumer-server

#### 两者都为server

consumer & provider 本质都为同一个东西。就是一个服务。
projvider : 向注册中心提供一个接口
consumer : 从注册中心获取一个接口使用

### 从nacos 配置中心中获取应用配置

ting-config-server 应用分组获取配置

nocos config 默认通过bootstrap.properties 配置，nocos cofig 的获取地址

项目属性的优先级：nacos > local(本地为 application.properties/yml)

1、本地与 nacos 存在相同的属性，则会读取 nacos 的值

2、nacos 中不存在的属性，则读取本地

nocos 支持多属性文件的配置。







	


