# Scala Type Safety Issue with Generic Method

This repository demonstrates a subtle type safety issue in Scala when using the `==` operator within a generic method. The code compiles without errors, but throws a runtime exception under certain conditions. This is because the `==` operator's behavior changes with different types, resulting in unexpected results during runtime when used with generics.

## Problem Description

The problem stems from the use of `==` within a generic method which compares objects for equality which can result in `ClassCastException` error. This issue highlights the importance of using type-safe comparison methods when working with generics in Scala.