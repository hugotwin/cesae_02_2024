export interface MoviesResponse{
  Search :Movie[]
  totalResults :string
  Response:string

}

export interface Movie{
  Title:string
  Year:string
  Type:string
  Poster:string
}

