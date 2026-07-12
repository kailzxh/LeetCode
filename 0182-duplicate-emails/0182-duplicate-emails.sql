select distinct email from Person p
where email in(select email from Person Pp where Pp.id <> p.id );