let Movie = require('./movieModel');

exports.create = function(req,res){
    console.log('Came inside the save method of movie Controller');
    let movie = new Movie();
    movie.name = req.body.name;
    movie._id = req.body._id;
    movie.save(function(err){
        res.json({
            status: 'SUCCESS',
            message:'Saved Movie Successfully'
        });
    });
    
}

exports.listAll = function(req,res){
    Movie.find(req.params.movie_id, function (err, movies) {
        if (err)
            res.send(err);
        res.json({
            name: movies
        });
    });
};

exports.findByID = function(req, res){
    Movie.findById(req.params.id, function (err, movies) {
        if (err)
            res.send(err);
        res.json({
            message: 'Movie details loading..',
            name: movies.name
        });
    });
}