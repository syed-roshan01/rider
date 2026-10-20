.class public abstract Lr9/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/Collection;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ll/q;->o()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lr8/o;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lr8/o;-><init>(Ljava/lang/Object;I)V

    instance-of v0, v1, Lk9/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lk9/a;

    invoke-direct {v0, v1}, Lk9/a;-><init>(Lr8/o;)V

    move-object v1, v0

    :goto_0
    invoke-static {v1}, Lk9/k;->I0(Lk9/i;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sput-object v0, Lr9/f;->a:Ljava/util/Collection;

    return-void
.end method
