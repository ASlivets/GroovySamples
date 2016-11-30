String.metaClass.isTheBest { ->
    delegate.toString() == 'Bernhard'
}

assert 'Oleksii'.isTheBest() == false
assert 'Bernhard'.isTheBest() == true
