// Module Math that contains the struct Math with its functions to calculate some mathematical problems.
//
// 	math := math.NewMath()
// 	fmt.Println(math.Fibonacci(10))
package math


// Struct Math that will be used to calculate some mathematical problems.
type Math struct {}


// Function responsible to create a Math object to call the functions of Math struct (constructor).
func NewMath() *Math {
	return new(Math)
}

// Returns the fibonacci number of `num`.
func (math *Math) Fibonacci(num uint32) uint64 {
	if num == 0 {
		return 0
	}

	if num == 1 {
		return 1
	}

	fibonacci := []uint64{0,1}

	for i := 2; i <= int(num); i++ {
		sum := fibonacci[i - 1] + fibonacci[i - 2]
		fibonacci = append(fibonacci, sum)
	}
	return fibonacci[len(fibonacci) - 1]
}

// Returns the square number of `num`.
func (math *Math) Square(num uint32) uint64 {
	return uint64(num * num)
}