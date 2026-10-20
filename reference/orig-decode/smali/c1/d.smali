.class public final Lc1/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lc9/c;

.field public final b:Ljava/util/LinkedHashSet;

.field public final c:Ljava/util/LinkedHashSet;

.field public final d:Ljava/util/LinkedHashSet;

.field public final e:Lt/l0;


# direct methods
.method public constructor <init>(Lu1/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/d;->a:Lc9/c;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lc1/d;->c:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lc1/d;->d:Ljava/util/LinkedHashSet;

    new-instance p1, Lt/l0;

    const/16 v0, 0x12

    invoke-direct {p1, p0, v0}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lc1/d;->e:Lt/l0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/LinkedHashSet;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    iget-object p2, p0, Lc1/d;->c:Ljava/util/LinkedHashSet;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    add-int/2addr p2, p1

    iget-object p1, p0, Lc1/d;->d:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    add-int/2addr p1, p2

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lc1/d;->e:Lt/l0;

    iget-object p2, p0, Lc1/d;->a:Lc9/c;

    invoke-interface {p2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
