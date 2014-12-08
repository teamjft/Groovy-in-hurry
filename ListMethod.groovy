def list = [1,2,3]
println list.count(2)
println list.max()
println list.min()
def even = list.find { item ->
item % 2 == 0
}
println even
println list.every { item -> item < 5}
println list.any { item -> item < 2}
def store = ''
list.each { item ->
store += item
}
assert store == '123'
store = ''
list.reverseEach{ item ->
store += item
}
assert store == '321'
assert list.join('-') == '1-2-3'
result = list.inject(0){ clinks, guests ->
clinks += guests
}
assert result== 0 + 1+2+3
assert list.sum() == 6
