.class public final La4/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:La4/c0;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La4/w;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, La4/c0;

    const/16 v0, 0x1e

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, La4/c0;-><init>(II)V

    iput-object p1, p0, La4/b;->a:La4/c0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La4/b;->b:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La4/b;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(II)I
    .locals 3

    iget-object v0, p0, La4/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La4/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public final b(La4/a;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p1, La4/a;->a:Ljava/lang/Object;

    iget-object v0, p0, La4/b;->a:La4/c0;

    invoke-virtual {v0, p1}, La4/c0;->o(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La4/a;

    invoke-virtual {p0, v2}, La4/b;->b(La4/a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
