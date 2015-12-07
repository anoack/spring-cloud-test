#!/bin/bash

HERE=$(dirname $0)
LOGDIR=${HERE}/../log

for PID in `cat ${LOGDIR}/PIDS.log`; do
  kill ${PID}
done
echo "" > ${LOGDIR}/PIDS.log
