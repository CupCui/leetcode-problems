# CLAUDE.md

此文件为 Claude Code (claude.ai/code) 在处理此仓库中的代码时提供指导。

## 项目概述

这是一个基于 Java 的 LeetCode 练习仓库，使用 Spring Boot 2.3.12 和 Maven 构建。项目包含按类别和来源平台组织的算法题解。

## 构建与运行命令

### 核心开发命令
```bash
# 编译项目
./mvnw compile

# 运行测试
./mvnw test

# 运行指定测试类
./mvnw test -Dtest=BinarySearchTest

# 打包应用
./mvnw package

# 运行 Spring Boot 应用
./mvnw spring-boot:run
```

**Windows 用户注意：** 使用 `mvnw.cmd` 代替 `./mvnw`（例如：`mvnw.cmd compile`）

## 代码架构

### 包结构（Package Structure）
代码库按题目来源和类别组织：
- `top.cupcupcui.leetcodeproblems.alichengyun` - 个人题目实现
- `top.cupcupcui.leetcodeproblems.array` - 数组操作类题目
- `top.cupcupcui.leetcodeproblems.binarysearch` - 二分查找算法题目
- `top.cupcupcui.leetcodeproblems.geminiinterview20` - Gemini 面试题（部分题目使用 Spring 注解）
- `top.cupcupcui.leetcodeproblems.huawei` - 华为相关题目（包含 `leetcode` 和 `nowcoder` 子目录）
- `top.cupcupcui.leetcodeproblems.nowcoderproblems` - 牛客网平台题目（包含 `JianzhiOffer` 子目录）
- `top.cupcupcui.leetcodeproblems.problems` - 通用 LeetCode 题目（包含 SQL 解法）
- `top.cupcupcui.leetcodeproblems.sorting` - 排序算法题目
- `top.cupcupcui.leetcodeproblems.topinterview150` - 面试经典 150 题
- `top.cupcupcui.leetcodeproblems.topinterview150II` - 面试经典 150 题（第二轮练习）

### 题目实现模式
每个题目遵循一致的结构：
1. 位于 `src/main/java/` 的题目类包含：
   - 包含题目描述、示例、约束和标签的 JavaDoc
   - 时间/空间复杂度分析注释
   - 解法方法
2. 位于 `src/test/java/` 的对应测试类，使用 JUnit 4

### 测试方式
- 测试使用 JUnit 4，方法名遵循 `test_PositiveCase{N}` 模式
- 每个测试方法在注释中包含输入/输出示例
- 边界情况通过连续的测试方法覆盖

## 关键技术细节
- Java 8 兼容 Oracle JDK
- Spring Boot 2.3.12（主要用于依赖管理和构建配置，大多数题目解法是纯 Java 算法，不使用 Spring 功能）
- Lombok 用于减少样板代码
- 包含 Maven Wrapper 保证跨环境构建一致性
- JUnit 4.13.2 用于测试（compile 作用域）
- 包含 `spring-boot-starter-web`、`spring-data-redis` 等依赖（主要用于 geminiinterview20 相关题目的 Spring 注解支持）
- `application.properties` 为空 - 无需活跃配置

## 开发说明
- 大部分题目解法是纯 Java 算法，不使用 Spring 依赖（Spring Boot 仅用于构建管理）
- 每个题目域在 `src/main/java` 和 `src/test/java` 中都保持平行的包结构
- 添加新题目时，按照来源平台和算法类别遵循现有的包组织结构
- 项目中包含 Maven Wrapper（`mvnw`/`mvnw.cmd`），建议使用 Wrapper 而非本地 Maven 安装以保证构建一致性
- **交流语言**：用户使用中文提问，请用中文回答
