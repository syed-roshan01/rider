.class public final Lea/c;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lja/j;

.field public static final e:Lja/j;

.field public static final f:Lja/j;

.field public static final g:Lja/j;

.field public static final h:Lja/j;

.field public static final i:Lja/j;


# instance fields
.field public final a:Lja/j;

.field public final b:Lja/j;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lja/j;->d:Lja/j;

    const-string v0, ":"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lea/c;->d:Lja/j;

    const-string v0, ":status"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lea/c;->e:Lja/j;

    const-string v0, ":method"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lea/c;->f:Lja/j;

    const-string v0, ":path"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lea/c;->g:Lja/j;

    const-string v0, ":scheme"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lea/c;->h:Lja/j;

    const-string v0, ":authority"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lea/c;->i:Lja/j;

    return-void
.end method

.method public constructor <init>(Lja/j;Lja/j;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/c;->a:Lja/j;

    iput-object p2, p0, Lea/c;->b:Lja/j;

    .line 2
    invoke-virtual {p1}, Lja/j;->d()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lja/j;->d()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Lea/c;->c:I

    return-void
.end method

.method public constructor <init>(Lja/j;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lja/j;->d:Lja/j;

    invoke-static {p2}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lea/c;-><init>(Lja/j;Lja/j;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lja/j;->d:Lja/j;

    invoke-static {p1}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p1

    invoke-static {p2}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lea/c;-><init>(Lja/j;Lja/j;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lea/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lea/c;

    iget-object v1, p1, Lea/c;->a:Lja/j;

    iget-object v3, p0, Lea/c;->a:Lja/j;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lea/c;->b:Lja/j;

    iget-object p1, p1, Lea/c;->b:Lja/j;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lea/c;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lea/c;->b:Lja/j;

    invoke-virtual {v1}, Lja/j;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lea/c;->a:Lja/j;

    invoke-virtual {v1}, Lja/j;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lea/c;->b:Lja/j;

    invoke-virtual {v1}, Lja/j;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
