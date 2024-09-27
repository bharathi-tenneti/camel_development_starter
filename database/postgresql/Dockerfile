FROM centos/postgresql-13-centos7:latest

LABEL "io.openshift.s2i.build.image"="centos/postgresql-13-centos7:latest"

USER root

COPY config/ /usr/share/container-scripts/postgresql

COPY scripts/ /tmp/src

RUN chown -R 26:0 /tmp/src

USER 26

RUN /usr/libexec/s2i/assemble

CMD /usr/libexec/s2i/run
