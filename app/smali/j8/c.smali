.class public final Lj8/c;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lja/j;

.field public static final e:Lja/j;

.field public static final f:Lja/j;

.field public static final g:Lja/j;

.field public static final h:Lja/j;


# instance fields
.field public final a:Lja/j;

.field public final b:Lja/j;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lja/j;->d:Lja/j;

    const-string v0, ":status"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lj8/c;->d:Lja/j;

    const-string v0, ":method"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lj8/c;->e:Lja/j;

    const-string v0, ":path"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lj8/c;->f:Lja/j;

    const-string v0, ":scheme"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lj8/c;->g:Lja/j;

    const-string v0, ":authority"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object v0

    sput-object v0, Lj8/c;->h:Lja/j;

    const-string v0, ":host"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    const-string v0, ":version"

    invoke-static {v0}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    return-void
.end method

.method public constructor <init>(Lja/j;Lja/j;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/c;->a:Lja/j;

    iput-object p2, p0, Lj8/c;->b:Lja/j;

    .line 6
    invoke-virtual {p1}, Lja/j;->d()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lja/j;->d()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Lj8/c;->c:I

    return-void
.end method

.method public constructor <init>(Lja/j;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lja/j;->d:Lja/j;

    invoke-static {p2}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p2

    .line 2
    invoke-direct {p0, p1, p2}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    sget-object v0, Lja/j;->d:Lja/j;

    invoke-static {p1}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p1

    invoke-static {p2}, Lfa/l;->h(Ljava/lang/String;)Lja/j;

    move-result-object p2

    .line 4
    invoke-direct {p0, p1, p2}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lj8/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lj8/c;

    iget-object v0, p1, Lj8/c;->a:Lja/j;

    iget-object v2, p0, Lj8/c;->a:Lja/j;

    invoke-virtual {v2, v0}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj8/c;->b:Lja/j;

    iget-object p1, p1, Lj8/c;->b:Lja/j;

    invoke-virtual {v0, p1}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lj8/c;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj8/c;->b:Lja/j;

    invoke-virtual {v1}, Lja/j;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lj8/c;->a:Lja/j;

    invoke-virtual {v0}, Lja/j;->t()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj8/c;->b:Lja/j;

    invoke-virtual {v1}, Lja/j;->t()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s: %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
