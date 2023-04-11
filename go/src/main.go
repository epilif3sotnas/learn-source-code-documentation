// Package that runs the fibonacci and square of 10 number.
package main

import(
	// std
	"fmt"

	// internal
	"learn-source-code-documentation/math"
) 
	

func main() {
	math := math.NewMath()
	fmt.Println(math.Fibonacci(10))
	fmt.Println(math.Square(10))
}