# postgresql-camelk

Postgresql image used in the Camel K Workshop

  env vars:

    -e POSTGRESQL_USER=redhat
    -e POSTGRESQL_PASSWORD=redhat
    -e POSTGRESQL_ADMIN_PASSWORD=redhat
    -e POSTGRESQL_DATABASE=camelk

## Build and push using tekton

    oc create -f tekton/source-pvc.yml
    oc apply -f tekton/s2i-task.yml
    oc apply -f tekton/postgresql-pipeline.yml


## Deploying the image

    oc new-app --name postgresqldb -e POSTGRESQL_USER=redhat -e POSTGRESQL_PASSWORD=redhat -e POSTGRESQL_ADMIN_PASSWORD=redhat -e POSTGRESQL_DATABASE=camelk quay.io/gcamposo/postgresql-camelk:latest


This image is available on Quay.io    

[![Docker Repository on Quay](https://quay.io/repository/gcamposo/postgresql-camelk/status "Docker Repository on Quay")](https://quay.io/repository/gcamposo/postgresql-camelk)
