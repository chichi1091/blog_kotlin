select
    /*%expand*/*
from
    users
where
  name = /* username */'hoge'
  and password = /* password */'password'
order by
    id desc