#!/bin/sh

psql -U $POSTGRESQL_USER  -d $POSTGRESQL_DATABASE -c "CREATE TABLE IF NOT EXISTS messages (column1 varchar(80), column2 varchar(80), column3 varchar(80), column4 varchar(80), column5 varchar(80));"
echo "Table Created!"
