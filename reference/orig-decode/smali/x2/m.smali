.class public final Lx2/m;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lx2/m;


# instance fields
.field public final a:Lx2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-static {v0}, Lx2/l;->a([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object v0

    new-instance v1, Lx2/m;

    new-instance v2, Lx2/o;

    invoke-direct {v2, v0}, Lx2/o;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Lx2/m;-><init>(Lx2/o;)V

    sput-object v1, Lx2/m;->b:Lx2/m;

    return-void
.end method

.method public constructor <init>(Lx2/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/m;->a:Lx2/n;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lx2/m;

    if-eqz v0, :cond_0

    check-cast p1, Lx2/m;

    iget-object p1, p1, Lx2/m;->a:Lx2/n;

    iget-object v0, p0, Lx2/m;->a:Lx2/n;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lx2/m;->a:Lx2/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx2/m;->a:Lx2/n;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
