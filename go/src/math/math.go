package math

// std


type Math struct {}


func NewMath() *Math {
	return new(Math)
}

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

func (math *Math) Square(num uint32) uint64 {
	return uint64(num * num)
}