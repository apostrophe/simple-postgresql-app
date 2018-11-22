

$ mvn spring-boot:run 

$ curl localhost:8080/save/ && echo
$ curl localhost:8080/findAll/ && echo
$ curl localhost:8080/findbyid?id=7 && echo
$ curl localhost:8080/findbylastname?lastname=Smith && echo


PostGreSQL

Basic version/status:

    $ psql --version
    $ /etc/init.d/postgresql status


Basics commands

    psql - interactive terminal
    postgresql - server
    great resource for learning more: http://www.postgresqltutorial.com/
    
    psql - from bash
    psql    # simple way to connect
    psql -d database -U user -W # connect to database, with username & password
    psql --list # list databases
    
    psql - within psql
    psql> \l    # list all databases
    psql> \c <db>   # connect to another db
    psql> \dt *.*   # list all tables
    psql> \d table_name # basic info on a table name
    psql> \dt *product*     # list tables with 'product' in their name
    psql> \du   # list all users
    psql> \df \dv   # list all functions, views
    psql> \s    # show command history
    psql> \s <filename> # save command history to <filename>
    
    psql> alter user bschilke with password 'jetta96.';
    psql> ALTER DATABASE name OWNER TO new_owner
    
    psql> \i <filename> # run file
    psql> \?    # list all commands --> sends to less
    psql> \h alter table    # get command-specific help (if you know command)
    psql> \h    # get command

    great resource: http://www.postgresqltutorial.com/psql-commands/

    