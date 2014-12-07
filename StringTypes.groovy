println "Single Quote*****************************"
def singleQuote = 'Single Quote'
println singleQuote.getClass()
println singleQuote
println "Double Quote*****************************"
def doubleQuote = "Double Quote ${singleQuote}"
println doubleQuote.dump()
println doubleQuote
println "Triple Single Quote*****************************"
def singleQuoteTest = 'Single Quote $singleQuote'
println singleQuoteTest
def joey = 'Joey Tribbiani'
def tripleSingleQuote = '''I am $joey
and i am disgusting'''
println tripleSingleQuote.getClass()
println tripleSingleQuote
println "Triple Double Quote*****************************"
def tripleDoubleQuote = """I am $joey
       and i am disgusting"""
println tripleDoubleQuote.getClass()
println tripleDoubleQuote
