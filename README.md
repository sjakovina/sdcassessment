This demo is a RESTFul middleware toolkit for building API gateways and was developed by Swiss Post. 

It integrates different modules and offers various functionalities, split into modules. One of those modules offers a asynchronus, dynamic queuing mechanism.

Dynamic queues are stored as redis lists, thus created only when needed and removed when empty. 

One of the features of the queuing mechanism are "Queue Circuit Breaker" (hereinafter referred to as QCB).

The QCB can be used to protect your server from having to deal with lots of queued requests when a backend is not reachable.
In our case, the QCB is coupled to an elemnt of our backend, the routing rules. Every routing rule can be seen as a circuit. The QCB can gather statistics for these circuits with each queued request made. When the configured fail ratio threshold is reached, the circuit is switched to status open.
Queued requests against open circuits will no be executed but instantly rejected. This rejecting of queued requests reduces the load the server has to deal with.
