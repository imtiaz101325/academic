/*
  BFS Implimentation
  Sk. Imtiaz Ahmed
  15101054
*/

//adjecency list (Same graph as CLRS book Figure 22.3)
let graph = [
              [1,4],
              [0,5],
              [3,5,6],
              [2,6,7],
              [0],
              [1,2,6],
              [2,3,5,7],
              [3,6]
            ];

//tried to follow the algorithm as much as possible
//ecmascript 2015 arrow function notation
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Functions#Arrow_functions
const bfs = (G, s) => {

    //algo 1-4
    G = G.map(adj =>
      ({
        adjecent: adj,
        color : "white",
        distance : -1,
        pred : null
      })
    );
    //output
    /*[{"adjecent":[1,4],"color":"white","distance":-1,"pred":null},
    {"adjecent":[0,5],"color":"white","distance":-1,"pred":null}, ... etc*/

    //algo 5-9
    G[s].color = "gray";
    G[s].distance = 0;
    G[s].pred = null;

    let Q = [], u;
    Q.push(s);//JS array builtin .push .shift

    //algo 10 -18
    //problem: whould like to avoid while loop
    while(Q.length !== 0){
        u = Q.shift();
        G[u].adjecent.forEach( v => {
              if (G[v].color === "white") {
                G[v].color = "gray";
                G[v].distance = G[u].distance+1;
                G[v].pred = G[u];
                Q.push(v);
              }
            })
        G[u].color = "black";
      }
    return G;
  }
  console.log(bfs(graph,1))
//output
/*[
{"adjecent":[1,4],
"color":"black",
"distance":1,
"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}
},
{"adjecent":[0,5],"color":"black","distance":0,"pred":null},
{"adjecent":[3,5,6],"color":"black","distance":2,"pred":{"adjecent":[1,2,6],"color":"black","distance":1,"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}}},
{"adjecent":[2,6,7],"color":"black","distance":3,"pred":{"adjecent":[3,5,6],"color":"black","distance":2,"pred":{"adjecent":[1,2,6],"color":"black","distance":1,"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}}}},
{"adjecent":[0],"color":"black","distance":2,"pred":{"adjecent":[1,4],"color":"black","distance":1,"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}}},
{"adjecent":[1,2,6],"color":"black","distance":1,"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}},{"adjecent":[2,3,5,7],"color":"black","distance":2,"pred":{"adjecent":[1,2,6],"color":"black","distance":1,"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}}},
{"adjecent":[3,6],"color":"black","distance":3,"pred":{"adjecent":[2,3,5,7],"color":"black","distance":2,"pred":{"adjecent":[1,2,6],"color":"black","distance":1,"pred":{"adjecent":[0,5],"color":"black","distance":0,"pred":null}}}}
]*/
