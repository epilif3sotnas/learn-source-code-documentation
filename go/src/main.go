package main

// std
import "fmt"

// internal
import "learn-source-code-documentation/math"


func main() {
	math := math.NewMath()
	fmt.Println(math.Fibonacci(10))
	fmt.Println(math.Square(10))
}