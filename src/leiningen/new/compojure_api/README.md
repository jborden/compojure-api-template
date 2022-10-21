# {{name}}

FIXME

## Prerequisites

You will need [Leiningen][1] 2.9.8 or above installed.

## Running

To start a web server for the application, run:

    lein repl

## Modifying handler.clj

Restart the server when handler.clj is modified

```
{{name}}.server/start-server!
```

## Interacting

By default, the server will run on http://localhost:3000

The following routes should work:

```
# create a user
curl -X POST http://localhost:3000/user -H "Content-Type: application/json" -d '{"first_name":"foo","last_name":"bar"}'

# read
curl http://localhost:3000/user/1

# update
curl -X PUT http://localhost:3000/user/1 -H "Content-Type: application/json" -d '{"first_name":"foo","last_name":"bar"}'

# delete
curl -X DELETE http://localhost:3000/user/1 -H "Content-Type: application/json"
```

## PSQL datasource

By default `profiles.clj` uses the db {{name}}. You should modify `profiles.clj` to
correspond to your configuration. 

Creating hikari pool connections to the database is disabled by default in `src/dev.clj`,
so you will need to uncomment the `({{name}}.db/init-db-conn!)` line to re-enable it.

## License

Copyright © {{year}} FIXME
