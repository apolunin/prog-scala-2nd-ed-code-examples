// src/main/scala/progscala2/patternmatching/regex-assignments.sc

val cols = """\*|[\w, ]+"""
val table = """\w+"""
val others = """.*"""
val selectRE = 
  s"""SELECT\\s*(DISTINCT)?\\s+($cols)\\s*FROM\\s+($table)\\s*($others)?;""".r

val selectRE(distinct1, cols1, table1, otherClauses1) = 
  "SELECT DISTINCT * FROM atable;"
val selectRE(distinct2, cols2, table2, otherClauses2) = 
  "SELECT col1, col2 FROM atable;"
val selectRE(distinct3, cols3, table3, otherClauses3) = 
  "SELECT DISTINCT col1, col2 FROM atable;"
val selectRE(distinct4, cols4, table4, otherClauses4) = 
  "SELECT DISTINCT col1, col2 FROM atable WHERE col1 = 'foo';"
