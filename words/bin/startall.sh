#!/bin/bash

PROFILES=('subject' 'verb' 'adjective' 'noun');

HERE=$(dirname $0)
LOGDIR=${HERE}/../log
mkdir -p ${LOGDIR}
JARS=(`ls ${HERE}/../target/words*.jar | sort -r`)


for PROFILE in ${PROFILES[@]}; do
  java -jar ${JARS[0]} --spring.profiles.active=${PROFILE} > ${LOGDIR}/${PROFILE}.log 2>&1 &
  echo $! >> ${LOGDIR}/PIDS.log
done
