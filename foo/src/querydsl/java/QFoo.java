import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QFoo is a Querydsl query type for Foo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFoo extends EntityPathBase<Foo> {

    private static final long serialVersionUID = 70822L;

    public static final QFoo foo = new QFoo("foo");

    public final StringPath name = createString("name");

    public QFoo(String variable) {
        super(Foo.class, forVariable(variable));
    }

    public QFoo(Path<? extends Foo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFoo(PathMetadata<?> metadata) {
        super(Foo.class, metadata);
    }

}

