package com.cals.movies

import com.cals.movies.data.source.local.entity.MovieEntity
import com.cals.movies.data.source.local.entity.TvShowEntity
import com.cals.movies.data.source.remote.response.MovieResponse
import com.cals.movies.data.source.remote.response.TvShowResponse

object DataStatic {

    fun generateStaticMovie(): List<MovieEntity>{
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                "MOVIE_1",
                "Cruella",
                "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
                "2021-05-26",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/A0knvX7rlwTyZSKj8H5NiARb45.jpg",
                )
            )
        movies.add(
            MovieEntity(
                "MOVIE_2",
                "Wrath of Man",
                "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/YxopfHpsCV1oF8CZaL4M3Eodqa.jpg"
            )

        )
        movies.add(
            MovieEntity(
                "MOVIE_3",
                "Zack Snyder's Justice Leagu",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "2021-03-18",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg"
            )

        )
        movies.add(
            MovieEntity(
                "MOVIE_4",
                "he Banishing",
                "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                "2021-04-29",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xD9mc8JCVXA8T8u4Od7qOUBuGH4.jpg"
            )

        )
        movies.add(
            MovieEntity(
                "MOVIE_5",
                "Friends: The Reunion",
                "The cast of Friends reunites for a once-in-a-lifetime celebration of the hit series, an unforgettable evening filled with iconic memories, uncontrollable laughter, happy tears, and special guests.",
                "2021-05-27",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bT3c4TSOP8vBmMoXZRDPTII6eDa.jpg"
            )

        )
        movies.add(
            MovieEntity(
                "MOVIE_6",
                "Curious George: Go West, Go Wild",
                "While farm-sitting, George accidentally lets the farm animals escape. Ted, George and wannabe cowboy Emmett must round 'em up, accounting for every animal -- and emerging with some new skills, to boot.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7WWOiP8F6PHjXpJrnRZfvO2XNW.jpg"
            )

        )
        movies.add(
            MovieEntity(
                "MOVIE_7",
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg"
                )
        )
        movies.add(
            MovieEntity(
                "MOVIE_8",
                "Army of the Dead",
                "Following a zombie outbreak in Las Vegas, a group of mercenaries take the ultimate gamble: venturing into the quarantine zone to pull off the greatest heist ever attempted.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z8CExJekGrEThbpMXAmCFvvgoJR.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "MOVIE_9",
                "I Am All Girls",
                "A special crimes investigator forms an unlikely bond with a serial killer to bring down a global child sex trafficking syndic.",
                "2021-05-14",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/m6bUeV4mczG3z2YXXr5XDKPsQzv.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "MOVIE_10",
                "Raya and the Last Dragon",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                "2021-03-03",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg"
            )
        )
        return movies
    }

    fun generateRemoteDataMovie(): List<MovieResponse> {
        val movies = ArrayList<MovieResponse>()

        movies.add(
            MovieResponse(
                "MOVIE_1",
                "Cruella",
                "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
                "2021-05-26",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/A0knvX7rlwTyZSKj8H5NiARb45.jpg",
            )
        )
        movies.add(
            MovieResponse(
                "MOVIE_2",
                "Wrath of Man",
                "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/YxopfHpsCV1oF8CZaL4M3Eodqa.jpg"
            )

        )
        movies.add(
            MovieResponse(
                "MOVIE_3",
                "Zack Snyder's Justice Leagu",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "2021-03-18",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg"
            )

        )
        movies.add(
            MovieResponse(
                "MOVIE_4",
                "he Banishing",
                "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                "2021-04-29",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xD9mc8JCVXA8T8u4Od7qOUBuGH4.jpg"
            )

        )
        movies.add(
            MovieResponse(
                "MOVIE_5",
                "Friends: The Reunion",
                "The cast of Friends reunites for a once-in-a-lifetime celebration of the hit series, an unforgettable evening filled with iconic memories, uncontrollable laughter, happy tears, and special guests.",
                "2021-05-27",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bT3c4TSOP8vBmMoXZRDPTII6eDa.jpg"
            )

        )
        movies.add(
            MovieResponse(
                "MOVIE_6",
                "Curious George: Go West, Go Wild",
                "While farm-sitting, George accidentally lets the farm animals escape. Ted, George and wannabe cowboy Emmett must round 'em up, accounting for every animal -- and emerging with some new skills, to boot.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7WWOiP8F6PHjXpJrnRZfvO2XNW.jpg"
            )

        )
        movies.add(
            MovieResponse(
                "MOVIE_7",
                "Godzilla vs. Kong",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg"
            )
        )
        movies.add(
            MovieResponse(
                "MOVIE_8",
                "Army of the Dead",
                "Following a zombie outbreak in Las Vegas, a group of mercenaries take the ultimate gamble: venturing into the quarantine zone to pull off the greatest heist ever attempted.",
                "2021-04-22",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z8CExJekGrEThbpMXAmCFvvgoJR.jpg"
            )
        )
        movies.add(
            MovieResponse(
                "MOVIE_9",
                "I Am All Girls",
                "A special crimes investigator forms an unlikely bond with a serial killer to bring down a global child sex trafficking syndic.",
                "2021-05-14",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/m6bUeV4mczG3z2YXXr5XDKPsQzv.jpg"
            )
        )
        movies.add(
            MovieResponse(
                "MOVIE_10",
                "Raya and the Last Dragon",
                "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
                "2021-03-03",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg"
            )
        )

        return movies
    }

    fun generateStaticTvShow(): List<TvShowEntity>{
        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                "TVSHOW_1",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
            )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_2",
                "WandaVision",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/YxopfHpsCV1oF8CZaL4M3Eodqa.jpg"
            )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_3",
                "Elite",
                "When three working class kids enroll in the most exclusive school in Spain, the clash between the wealthy and the poor students leads to tragedy.",
                "2018",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3NTAbAiao4JLzFQw6YxP1YZppM8.jpg"
                )
        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_4",
                "Haunted: Latin America",
                "Real people's terrifying tales of the chilling, unexplained and paranormal come to life with dramatic reenactments in this reality series.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7au3qp7xw4fQ8eHEsrzWkFMVNm4.jpg"
                )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_5",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6kbAMLteGO8yyewYau6bJ683sw7.jpg"
            )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_6",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2005",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
            )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_7",
                "Superman & Lois",
                "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vlv1gn98GqMnKHLSh0dNciqGfBl.jpg"
            )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_8",
                "Who Killed Sara?",
                "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg"
                )
        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_9",
                "The Umbrella Academy",
                "Aksi & Petualangan, Sci-fi & Fantasy, Drama",
                "2017",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
               )

        )
        tvShows.add(
            TvShowEntity(
                "TVSHOW_10",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            )

        )
        return tvShows
    }

    fun generateRemoteDataTvShow(): List<TvShowResponse> {
        val tvShows = ArrayList<TvShowResponse>()

        tvShows.add(
            TvShowResponse(
                "TVSHOW_1",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_2",
                "WandaVision",
                "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/YxopfHpsCV1oF8CZaL4M3Eodqa.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_3",
                "Elite",
                "When three working class kids enroll in the most exclusive school in Spain, the clash between the wealthy and the poor students leads to tragedy.",
                "2018",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3NTAbAiao4JLzFQw6YxP1YZppM8.jpg"
            )
        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_4",
                "Haunted: Latin America",
                "Real people's terrifying tales of the chilling, unexplained and paranormal come to life with dramatic reenactments in this reality series.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7au3qp7xw4fQ8eHEsrzWkFMVNm4.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_5",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6kbAMLteGO8yyewYau6bJ683sw7.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_6",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2005",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_7",
                "Superman & Lois",
                "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vlv1gn98GqMnKHLSh0dNciqGfBl.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_8",
                "Who Killed Sara?",
                "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                "2021",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg"
            )
        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_9",
                "The Umbrella Academy",
                "Aksi & Petualangan, Sci-fi & Fantasy, Drama",
                "2017",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
            )

        )
        tvShows.add(
            TvShowResponse(
                "TVSHOW_10",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            )

        )
        return tvShows
    }
}