# postgresql

Postgresql image used in the demo
  env vars:

    -e POSTGRESQL_USER=redhat
    -e POSTGRESQL_PASSWORD=redhat
    -e POSTGRESQL_ADMIN_PASSWORD=redhat
    -e POSTGRESQL_DATABASE=camel

## How to build and publish the image using tekton

    oc create -f tekton/source-pvc.yml
    oc apply -f tekton/s2i-task.yml
    oc apply -f tekton/postgresql-pipeline.yml

Before running the pipeline be sure to add a secret called `quay-auth-secret` with Quay credentials in the pipeline namespace. 


## Deploying the image

    oc new-app --name postgresqldb -e POSTGRESQL_USER=redhat -e POSTGRESQL_PASSWORD=redhat -e POSTGRESQL_ADMIN_PASSWORD=redhat -e POSTGRESQL_DATABASE=camel quay.io/gcamposo/camel-demo-postgresql


This image is available on Quay.io    

[![Docker Repository on Quay](https://quay.io/repository/gcamposo/camel-demo-postgresql/status "Docker Repository on Quay")](https://quay.io/repository/gcamposo/camel-demo-postgresql)
