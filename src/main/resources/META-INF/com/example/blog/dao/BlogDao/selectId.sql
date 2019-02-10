select
    b.ID, b.TITLE, b.USER_ID, b.BODY, b.CREATE_DATETIME, u.NAME
from
    blogs b inner join users u on
      b.user_id = u.id
where
    b.id = /*id*/1
