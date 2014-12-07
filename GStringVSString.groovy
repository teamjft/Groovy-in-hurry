greeting = 'Hello'

println greeting.getClass()
def magicString = ' I will be invisible!!! Why?'
greeting << magicString
println greeting
println greeting.getClass()
//Mind the "=" operator after "<<" and magic is gone
greeting <<= magicString
println greeting
println greeting.getClass()
greeting[8..17] = ' '
println greeting

