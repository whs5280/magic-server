FROM registry.cn-hangzhou.aliyuncs.com/ydt/jdk21:pm2

ENV ENV 'deploy'

WORKDIR /data/www

COPY --chown=www-data:www-data ./ /data/www
COPY --chown=nginx:nginx mapi.server.com.conf /etc/nginx/conf.d/mapi.server.com.conf

RUN sed -i 's/\(error_log.\+\)warn/\1error/gi' /etc/nginx/nginx.conf


EXPOSE 80
EXPOSE 9988

CMD [ "pm2-docker", "/data/www/apps.yaml" ]