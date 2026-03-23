# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java-based LeetCode practice repository built with Spring Boot 2.3.12 and Maven. The project contains algorithmic problem solutions organized by category and source platform.

## Build and Run Commands

### Core Development Commands
```bash
# Compile the project
./mvnw compile

# Run tests
./mvnw test

# Run specific test class
./mvnw test -Dtest=BinarySearchTest

# Package the application
./mvnw package

# Run the Spring Boot application
./mvnw spring-boot:run
```

**Note for Windows users:** Use `mvnw.cmd` instead of `./mvnw` (e.g., `mvnw.cmd compile`)

## Code Architecture

### Package Structure
The codebase is organized by problem source and category:
- `top.cupcupcui.leetcodeproblems.alichengyun` - Personal problem implementations
- `top.cupcupcui.leetcodeproblems.array` - Array manipulation problems
- `top.cupcupcui.leetcodeproblems.binarysearch` - Binary search algorithm problems
- `top.cupcupcui.leetcodeproblems.geminiinterview20` - Problems from Gemini interview prep
- `top.cupcupcui.leetcodeproblems.huawei` - Huawei-related problems (with `leetcode` and `nowcoder` subdirectories)
- `top.cupcupcui.leetcodeproblems.nowcoderproblems` - NowCoder platform problems (including `JianzhiOffer` subdirectory)
- `top.cupcupcui.leetcodeproblems.problems` - General LeetCode problems (including SQL solutions)
- `top.cupcupcui.leetcodeproblems.sorting` - Sorting algorithm problems
- `top.cupcupcui.leetcodeproblems.topinterview150` - Top Interview 150 problems
- `top.cupcupcui.leetcodeproblems.topinterview150II` - Second pass of Top Interview 150 problems

### Problem Implementation Pattern
Each problem follows a consistent structure:
1. Problem class in `src/main/java/` with:
   - JavaDoc containing problem description, examples, constraints, and tags
   - Time/space complexity analysis in comments
   - Solution method(s)
2. Corresponding test class in `src/test/java/` using JUnit 4

### Testing Approach
- Tests use JUnit 4 with descriptive method names following `test_PositiveCase{N}` pattern
- Each test method includes input/output examples in comments
- Edge cases are covered in sequential test methods

## Key Technical Details
- Java 8 compatibility with Oracle JDK
- Spring Boot 2.3.12 (primarily for dependency management and build configuration, not used for web features in solutions)
- Lombok for boilerplate reduction
- Maven wrapper included for consistent builds across environments
- JUnit 4.13.2 for testing with compile scope
- Empty `application.properties` - no active configuration required

## Development Notes
- All problem solutions are pure Java algorithms with no Spring dependencies (Spring Boot is only for build management)
- Each problem domain maintains parallel structure in both `src/main/java` and `src/test/java`
- When adding new problems, follow the existing package organization by source platform and algorithm category
- **Communication Language**: Respond to user queries in Chinese (中文)