## Module Math that contains the type Math with its procedures to calculate some mathematical problems.
##
## ===========
## Basic Usage
## ===========
##
runnableExamples:
    let mathObj = newMath()
    let fibonacci10 = mathObj.fibonacci(10'u32)
    assert 55'u64 == fibonacci10


type
    Math = ref object


proc newMath*(): Math =
    ## Procedure responsible to create a Math object to call the procedures of Math type (constructor).
    runnableExamples:
        let mathObj = newMath()
    
    return Math()

proc fibonacci*(self: Math, num: uint32): uint64 =
    ## Returns the fibonacci number of `num`.
    runnableExamples:
        let mathObj = newMath()
        let fibonacci10 = mathObj.fibonacci(10'u32)
        assert 55'u64 == fibonacci10

    if num <= 0:
        return 0'u64

    if num == 1:
        return 1'u64

    var fibonacci = @[0'u64,1'u64]
    for i in 2..num:
        try:
            let sum = fibonacci[i - 1] + fibonacci[i - 2]
            fibonacci.add(sum)

        except Exception as ex:
            echo ex.getStackTrace()
            return 0'u64

    return fibonacci[^1]

proc square*(self: Math, num: uint32): uint64 =
    ## Returns the square number of `num`.
    runnableExamples:
        let mathObj = newMath()
        let square10 = mathObj.square(10'u32)
        assert 100'u64 == square10

    return num * num