FROM ubuntu:18.04
LABEL version="0.0.1"


# https://superuser.com/questions/1059346/apt-get-update-not-working-signing-verification-errors
RUN  rm -rf /tmp/* && apt-get update -q && \
        apt-get install --no-install-recommends -y \
        build-essential  protobuf-compiler python \
        libprotobuf-dev libcurl4-openssl-dev libboost-all-dev \
        libncurses5-dev libjemalloc-dev wget m4 g++ libssl-dev \
        clang-3.9 llvm  protobuf-compiler && rm -rf /var/lib/apt/lists/* && \
        ln -s /usr/bin/clang-3.9 /usr/bin/clang && \
        ln -s /usr/bin/clang++-3.9 /usr/bin/clang++

VOLUME [ "/rethinkdb" ]
COPY . /rethinkdb
WORKDIR /rethinkdb
RUN ./configure --allow-fetch CXX=clang++ --fetch npm && make -j4 DEBUG=1 && make install

# Define default command.
CMD ["rethinkdb", "--bind", "all"]

# Expose ports.
#   - 8080: web UI
#   - 28015: process
#   - 29015: cluster
EXPOSE 8080
EXPOSE 28015
EXPOSE 29015