def today = new Date()
assert 0 == (today <=> today)
assert 1 == (++today <=> new Date())
assert -1 == (3 <=> 4)
assert -1 == ('a' <=> 'b')
