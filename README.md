# factorial_ui

# creates simple docker to run application
docker run -p 9091:9091 ifactorial_ui:0.5

http://localhost:9091

# k8s
* don't use minikube - use k8s built into docker
* kubectl apply -f factorial_ui-deploy.yaml
* kubectl delete -n default deployment ifactorial_ui
* kubectl describe deploy
* kubectl get pods -l run=ifactorial_ui -o wide
* kubectl get pods -l run=ifactorial_ui -o yaml | grep podIP
* kubectl apply -f factorial_ui-service.yaml
* kubectl get svc ifactorial_ui

* moved port to 9091 - see application properties
