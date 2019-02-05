select
    /*%expand*/*
from
    users
where
  email = /* email */'hoge@gmail.com'
  and password = /* password */'password'
order by
    id desc