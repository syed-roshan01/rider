.class public final Li4/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Li4/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Li4/c;->a:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Li4/b;->a:Ljava/util/ArrayList;

    iget-object v0, p1, Li4/c;->b:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Li4/b;->b:Ljava/util/ArrayList;

    iget-object v0, p1, Li4/c;->c:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Li4/b;->c:Ljava/util/ArrayList;

    iget-object v0, p1, Li4/c;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Li4/b;->d:Ljava/util/ArrayList;

    iget-object p1, p1, Li4/c;->e:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Li4/b;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Lm4/f;Ljava/lang/Class;)V
    .locals 2

    iget-object v0, p0, Li4/b;->d:Ljava/util/ArrayList;

    new-instance v1, Lq8/f;

    invoke-direct {v1, p1, p2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lp4/a;Ljava/lang/Class;)V
    .locals 2

    iget-object v0, p0, Li4/b;->b:Ljava/util/ArrayList;

    new-instance v1, Lq8/f;

    invoke-direct {v1, p1, p2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
