# internal
import
  ./math/math

proc main() =
  let math = newMath()
  echo(math.fibonacci(10'u32))
  echo(math.square(10'u32))


when isMainModule:
  main()