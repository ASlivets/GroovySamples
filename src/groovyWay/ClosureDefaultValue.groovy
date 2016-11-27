package groovyWay

def mult = { int a, int b = 10 -> a * b }

assert mult(2, 3) == 6
assert mult(5) == 50


print "str".padRight(4) + "42"
