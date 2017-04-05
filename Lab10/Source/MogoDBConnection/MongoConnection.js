
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://root:root@ds161099.mlab.com:61099/asesample';
MongoClient.connect(url, function(err, db) {
  assert.equal(null, err);
  console.log("Connected correctly to server.");
  db.close();
});