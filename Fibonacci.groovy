def getFibonacci(int n){
current = 1
next= 1
	n.times {
		print current + ' '
		newCurrent = next
		next = next + current
		current = newCurrent
	}
	println ''
}
println "Welcome to the world of Groovy"
getFibonacci(20)
