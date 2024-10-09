class ETL {

    static transform(input) {
        def transformed = [:]

        input.each{ points, letters -> 
            letters.each{ letter -> 
                transformed[letter.toLowerCase()] = points.toInteger() 
            }
        }

        transformed
    }
}