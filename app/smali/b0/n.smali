.class public final Lb0/n;
.super Ljava/lang/Object;

# interfaces
.implements La0/o;


# instance fields
.field public final a:Lc9/c;

.field public final b:Lc9/g;


# direct methods
.method public constructor <init>(Lc9/c;Lc9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/n;->a:Lc9/c;

    iput-object p2, p0, Lb0/n;->b:Lc9/g;

    return-void
.end method


# virtual methods
.method public final getKey()Lc9/c;
    .locals 1

    iget-object v0, p0, Lb0/n;->a:Lc9/c;

    return-object v0
.end method
